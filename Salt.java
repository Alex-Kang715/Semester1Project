public class Salt {
  String formula, name;
  int cationCount, anionCount;
  double molarMassCation, molarMassAnion, molarMass;
  boolean cationPolyatomic, anionPolyatomic, soluble;
  private String solubility;
  public Salt(String cationName, String cationFormula, int cationCount, String anionName, String anionFormula, 
  int anionCount, int anionSolCase, boolean cationPolyatomic, boolean anionPolyatomic, double molarMassCation, double molarMassAnion) {
    boolean soluble = solubility(cationName, anionSolCase);
    String name = name(cationName, anionName);
    String formula = formula(cationFormula, anionFormula, cationCount, anionCount, cationPolyatomic, anionPolyatomic);
    double molarMass = molarMass(molarMassCation, molarMassAnion, cationCount, anionCount);
    this.soluble = soluble;
    this.name = name;
    this.cationCount = cationCount;
    this.anionCount = anionCount;
    this.formula = formula;
    this.molarMass = molarMass;
  }
  private boolean solubility(String cationName, int anionSolCase) {
    boolean soluble = true;
    if (anionSolCase == 1) {
      soluble = true;
    } else if (anionSolCase == 2) {
      if (((cationName.equalsIgnoreCase("Lead")) || cationName.equalsIgnoreCase("Mercury") || cationName.equalsIgnoreCase("Silver"))) {
        soluble = false;
      } else {
        soluble = true;
      }
    } else if (anionSolCase == 3) {
      if (((cationName.equalsIgnoreCase("Lead")) || cationName.equalsIgnoreCase("Mercury") ||
        cationName.equalsIgnoreCase("Silver")|| cationName.equalsIgnoreCase("Calcium")||
        cationName.equalsIgnoreCase("Barium")|| cationName.equalsIgnoreCase("Strontium"))) {
        soluble = false;
      } else {
        soluble = true;
      }
    } else if (anionSolCase == 4) {
      if (((cationName.equalsIgnoreCase("Lithium")) || cationName.equalsIgnoreCase("Potassium") ||
        cationName.equalsIgnoreCase("Sodium")|| cationName.equalsIgnoreCase("Ammonium") ||
        cationName.equalsIgnoreCase("Calcium") || cationName.equalsIgnoreCase("Strontium") ||
        cationName.equalsIgnoreCase("Barium"))) {
        soluble = true;
      } else {
        soluble = false;
      }
    } else if (anionSolCase == 5) {
      if (((cationName.equalsIgnoreCase("Lithium")) || cationName.equalsIgnoreCase("Potassium") ||
        cationName.equalsIgnoreCase("Sodium")|| cationName.equalsIgnoreCase("Ammonium"))) {
        soluble = true;
      } else {
        soluble = false;
      }
    }
    return soluble;
  }
  public String displaySolubility(){
    String solublility = null;
    if(soluble == true){
        solubility = "soluble";
    }
    if(soluble == false){
        solubility= "insoluble";
    }
    return solubility;
  }
  private String name(String cationName, String anionName) {
    return cationName + " " + anionName;
  }
  private String formula(String cationFormula, String anionFormula, int cationCount, int anionCount, boolean cationPolyatomic, boolean anionPolyatomic) {
    String newCationFormula = cationFormula;
    String newAnionFormula = anionFormula;
    if (cationPolyatomic == false && cationCount > 1) {
      newCationFormula = cationFormula + subscript(cationCount);
    } else if (cationPolyatomic == true && cationCount > 1) {
      newCationFormula = "("+ cationFormula +")"+subscript(cationCount);
    }
    if (anionPolyatomic == true && anionCount > 1) {
      newAnionFormula = "("+ anionFormula +")"+subscript(anionCount);
    } else if (anionPolyatomic == false && anionCount > 1) {
      newAnionFormula = anionFormula + subscript(anionCount);
    }
    return newCationFormula + newAnionFormula;
  }
  private String subscript(int n) {
    if (n == 1) {
      return "???";
    } else if (n==2) {
      return "???";
    } else if (n==3) {
      return "???";
    } else if (n==4) {
      return "???";
    } else {
      return "Error";
    }
  }
  private double molarMass(double molarMassCation,double molarMassAnion,int cationCount, int anionCount){
      molarMass = (cationCount*molarMassCation) + (anionCount * molarMassAnion);
      return molarMass;
  }
}