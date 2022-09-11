import 'dart:io';

Future<void> formatSolution(String solutionsPath, String difficulty) async {
  final solutions = File(solutionsPath);
  final contents = solutions.readAsLinesSync();
  final lines = contents.map(
    (e) => _SolutionLine(
      e,
      'https://leetcode.com/problems/${e.substring(e.indexOf('.') + 2).toLowerCase().replaceAll(' ', '-')}',
      './src/main/java/com/smlnskgmail/jaman/leetcodejava/$difficulty/${_toCamelCase(e)}',
    ),
  );
  for (var line in lines) {
    print(line.toReadmeLine());
  }
}

String _toCamelCase(String str) {
  final parts = str.split(' ');
  var newStr = '';
  for (final part in parts) {
    if (!part.contains('.')) {
      final newPart = part[0].toUpperCase() + part.substring(1);
      newStr += newPart;
    }
  }
  return '$newStr.java';
}

class _SolutionLine {
  final String name;
  final String link;
  final String path;

  _SolutionLine(
    this.name,
    this.link,
    this.path,
  );

  String toReadmeLine() => '| $name | [Link]($link) | [Link]($path) |';
}
