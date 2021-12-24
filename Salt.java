public class Salt {
  boolean soluble;
  String formula;
  String name;
  int cationCount;
  int anionCount;
  boolean cationPolyatomic;
  boolean anionPolyatomic;
  public Salt(String cationName, String cationFormula, int cationCount, String anionName, String anionFormula, int anionCount, int anionSolCase, boolean cationPolyatomic, boolean anionPolyatomic) {
    boolean soluble = solubility(cationName, anionSolCase);
    String name = name(cationName, anionName);
    String formula = formula(cationFormula, anionFormula, cationCount, anionCount, cationPolyatomic, anionPolyatomic);
    this.soluble = soluble;
    this.name = name;
    this.cationCount = cationCount;
    this.anionCount = anionCount;
    this.formula = formula;
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
      return "₁";
    } else if (n==2) {
      return "₂";
    } else if (n==3) {
      return "₃";
    } else if (n==4) {
      return "₄";
    } else {
      return "Error";
    }
  }
}