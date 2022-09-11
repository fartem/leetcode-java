class SolutionLine {
  final String name;
  final String link;
  final String path;

  String get readmeLine => '| $name | [Link]($link) | [Link]($path) |';

  SolutionLine({
    required this.name,
    required this.link,
    required this.path,
  });
}
