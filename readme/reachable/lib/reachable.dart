import 'dart:io';

import 'package:http/http.dart';

Future<void> check(String readmePath) async {
  final readme = File(readmePath);
  final buildCache = File('../.build_cache');
  if (!buildCache.existsSync()) {
    buildCache.createSync();
  }
  final cache = <String>{}..addAll(buildCache.readAsLinesSync());
  for (final line in readme.readAsLinesSync()) {
    if (line.startsWith('|')) {
      if (line.contains('https')) {
        final url = line.substring(
          line.indexOf('https'),
          line.indexOf('/)'),
        );
        if (cache.contains(url)) {
          continue;
        }
        try {
          final res = await get(Uri.parse(url));
          if (res.statusCode == HttpStatus.ok) {
            print('DONE: $url');
            buildCache.writeAsStringSync(
              '$url\n',
              mode: FileMode.append,
            );
            await Future.delayed(const Duration(seconds: 1));
          } else {
            print('ERROR: $url (${res.statusCode})');
            exit(1);
          }
        } on Exception catch (e) {
          print('ERROR: $url WITH $e');
          exit(1);
        }
      }
    }
  }
}
