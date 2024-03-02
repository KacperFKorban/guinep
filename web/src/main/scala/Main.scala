package guinep.testrun

def personsAge(name: String): Int = name match {
  case "Bartek" => 20
  case _ => 0
}

def upperCaseText(text: String): String =
  text.toUpperCase

def add(a: Int, b: Int) =
  a + b

def concat(a: String, b: String) =
  a + b

@main
def run: Unit =
  guinep.web(personsAge, upperCaseText, add, concat)