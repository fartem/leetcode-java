import 'dart:io';

import 'package:readme_gen/solution_line.dart';
import 'package:readme_gen/string_ext.dart';

Future<void> formatSolution(String solutionsPath, String difficulty) async {
  final solutions = File(solutionsPath);
  final contents = solutions.readAsLinesSync();
  final lines = contents.map(
    (e) => SolutionLine(
      name: e,
      link: 'https://leetcode.com/problems/${e.substring(e.indexOf('.') + 2).toLowerCase().replaceAll(' ', '-')}',
      path: './src/main/java/com/smlnskgmail/jaman/leetcodejava/$difficulty/${e.camelCase}.java',
    ),
  );
  for (var line in lines) {
    print(line.readmeLine);
  }
}
