public class Cation {
  boolean polyatomic;
  String formula, name;
  int charge;
  double molarMass;
  Cation(String name, String formula, int charge, boolean polyatomic, double molarMass) {
    this.formula = formula;
    this.name = name;
    this.charge = charge;
    this.polyatomic = polyatomic;
    this.molarMass = molarMass;
  }
}