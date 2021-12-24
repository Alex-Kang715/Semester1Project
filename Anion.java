public class Anion{
  boolean polyatomic;
  String formula;
  int charge;
  String name;
  int solCase;
  Anion(String name, String formula, int solCase, int charge, boolean polyatomic) {
    this.name = name;
    this.charge = charge;
    this.solCase = solCase;
    this.polyatomic = polyatomic;
    this.formula = formula;
  }
}
