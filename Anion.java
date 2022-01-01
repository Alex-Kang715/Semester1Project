public class Anion{
  boolean polyatomic;
  String formula, name;
  int charge, solCase;
  double molarMass;
  Anion(String name, String formula, int solCase, int charge, boolean polyatomic, double molarMass) {
    this.name = name;
    this.charge = charge;
    this.solCase = solCase;
    this.polyatomic = polyatomic;
    this.formula = formula;
    this.molarMass = molarMass;
  }
}
