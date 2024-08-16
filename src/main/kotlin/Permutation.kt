fun isPermutation(string1: String, string2: String): Boolean {
  if (string1.length != string2.length) {
    return false
  }

  val charCount = HashMap<Char, Int>()
  for (char in string1) {
    if (charCount[char] != null) {
      charCount.merge(char, 1) { old, _ -> old + 1 }
    } else {
      charCount[char] = 1
    }
  }

  for (char in string2) {
    if (charCount[char] == null || charCount[char] == 0) {
      return false
    } else { 
      charCount.merge(char, 1) { old, _ -> old - 1 }
    }
  }
  
  return true
}
