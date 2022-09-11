extension StringUtils on String {
  String get camelCase {
    final parts = split(' ');
    var newStr = '';
    for (final part in parts) {
      if (!part.contains('.')) {
        final newPart = part[0].toUpperCase() + part.substring(1);
        newStr += newPart;
      }
    }
    return newStr;
  }
}
