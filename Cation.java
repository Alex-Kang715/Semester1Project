public class Cation {
  boolean polyatomic;
  String formula;
  int charge;
  String name;
  Cation(String name, String formula, int charge, boolean polyatomic) {
    this.formula = formula;
    this.name = name;
    this.charge = charge;
    this.polyatomic = polyatomic;
  }
}