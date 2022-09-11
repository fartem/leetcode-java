import 'dart:io';

import 'package:http/http.dart';

Future<void> check(String readmePath) async {
  final readme = File(readmePath);
  final buildCache = File('../.build_cache');
  if (!buildCache.existsSync()) {
    buildCache.createSync();
  }
  final cache = <String>{}..addAll(buildCache.readAsLinesSync());
  var exitCode = 0;
  for (final line in readme.readAsLinesSync()) {
    if (line.startsWith('|')) {
      if (line.contains('(')) {
        final url = line.substring(line.indexOf('(') + 1, line.indexOf(')'));
        if (!url.startsWith('https')) {
          continue;
        }
        if (cache.contains(url)) {
          continue;
        }
        try {
          final res = await get(Uri.parse(url));
          if (res.statusCode == HttpStatus.ok) {
            print('DONE: $url');
            cache.add(url);
          } else {
            print('ERROR: $url (${res.statusCode})');
            exitCode = 1;
            break;
          }
        } on Exception catch (e) {
          print('ERROR: $url WITH $e');
          exitCode = 1;
          break;
        }
      }
    }
  }
  buildCache.writeAsStringSync(cache.map((e) => '$e\n').join());
  exit(exitCode);
}
