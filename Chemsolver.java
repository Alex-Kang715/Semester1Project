import java.util.Scanner;
public class Chemsolver {
  // Name, Formula, Solubility Case, Charge,
  public static Cation Lithium = new Cation("Lithium", "Li", +1, false);
  public static Cation Sodium = new Cation("Sodium", "Na", +1, false);
  public static Cation Potassium = new Cation("Potassium", "K", +1, false);
  public static Cation Ammonium = new Cation("Ammonium", "NH₄", +1, true);
  public static Cation Calcium = new Cation("Calcium", "Ca", +2, false);
  public static Cation Strontium = new Cation("Strontium", "Sr", +2, false);
  public static Cation Barium = new Cation("Barium", "Ba", +2, false);
  public static Cation Silver = new Cation("Silver", "Ag", +1, false);
  public static Cation Mercury = new Cation("Mercury", "Hg₂", +2, true);
  public static Cation Lead = new Cation("Lead", "Pb", +2, false);

  public static Anion Nitrate = new Anion("Nitrate", "NO₃", 1, -1, true);
  public static Anion Acetate = new Anion("Acetate", "C₂H₃O₂", 1, -1, true);
  public static Anion Chloride = new Anion("Chloride", "Cl", 2, -1, false);
  public static Anion Bromide = new Anion("Bromide", "Br", 2, -1, false);
  public static Anion Iodide = new Anion("Iodide", "I", 2, -1, false);
  public static Anion Hydroxide = new Anion("Hydroxide", "OH", 3, -1, true);
  public static Anion Sulfide = new Anion("Sulfide", "S", 3, -2, false);
  public static Anion Sulfate = new Anion("Sulfate", "SO₄", 4, -2, true);
  public static Anion Phosphate = new Anion("Phosphate", "PO₄", 5, -3, true);
  public static Anion Carbonate = new Anion("Carbonate", "CO₃", 5, -2, true);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("State First Cation");
    String cationName = scanner.nextLine();
    Cation cation = null;
    Anion anion = null;
    boolean cationSelected = false;
    boolean anionSelected= false;
    while (!cationSelected) {
      if (cationName.equalsIgnoreCase("Lithium")) {
        cation = Lithium;
      } else if (cationName.equalsIgnoreCase("Sodium")) {
        cation = Sodium;
      } else if (cationName.equalsIgnoreCase("Potassium")) {
        cation = Potassium;
      } else if (cationName.equalsIgnoreCase("Ammonium")) {
        cation = Ammonium;
      } else if (cationName.equalsIgnoreCase("Calcium")) {
        cation = Calcium;
      } else if (cationName.equalsIgnoreCase("Strontium")) {
        cation = Strontium;
      } else if (cationName.equalsIgnoreCase("Barium")) {
        cation = Barium;
      } else if (cationName.equalsIgnoreCase("Silver")) {
        cation = Silver;
      } else if (cationName.equalsIgnoreCase("Mercury")) {
        cation = Mercury;
      } else if (cationName.equalsIgnoreCase("Lead")) {
        cation = Lead;
      } else {
        cation = null;
      }
      if (cation != null) {
        System.out.println("Did you choose "+cation.name+"?");
        String confirm = scanner.nextLine();
        if (confirm.equals("y")) {
          cationSelected = true;
          cation = cation;
        } else if (confirm.equals("n")) {
          System.out.println("State First Ion");
          cationName = scanner.nextLine();
        }
      }
    }
    System.out.println("State First Anion");
    String anionName = scanner.nextLine();
    while (!anionSelected) {
      if (anionName.equals("Nitrate")) {
        anion = Nitrate;
      } else if (anionName.equalsIgnoreCase("Acetate")) {
        anion = Acetate;
      } else if (anionName.equalsIgnoreCase("Chloride")) {
        anion = Chloride;
      } else if (anionName.equalsIgnoreCase("Bromide")) {
        anion = Bromide;
      } else if (anionName.equalsIgnoreCase("Iodide")) {
        anion = Iodide;
      } else if (anionName.equalsIgnoreCase("Hydroxide")) {
        anion = Hydroxide;
      } else if (anionName.equalsIgnoreCase("Sulfide")) {
        anion = Sulfide;
      } else if (anionName.equalsIgnoreCase("Sulfate")) {
        anion = Sulfate;
      } else if (anionName.equalsIgnoreCase("Phosphate")) {
        anion = Phosphate;
      } else if (anionName.equalsIgnoreCase("Carbonate")) {
        anion = Carbonate;
      } else {
        anion = null;
      }
      if (anion != null) {
        System.out.println("Did you choose "+anion.name+"?");
        String confirm = scanner.nextLine();
        if (confirm.equals("y")) {
          anion = anion;
          anionSelected = true;
        } else if (confirm.equals("n")) {
          System.out.println("State First Anion");
          anionName = scanner.nextLine();
          anion = null;
        }
      }
    } 
    System.out.println(makeSalt(cation, anion).formula + " " + makeSalt(cation, anion).soluble);
  }
  public String superscript(int i) {
    if (i == -3) {
      return"³⁺";
    }
    return "a";
  }
  public static Cation selectCation(String cationName) {
    Cation cation;
    return null;
  }
  public static Salt makeSalt(Cation cation, Anion anion) {
    int netCharge = cation.charge;
    int cationCount = 1;
    int anionCount = 0;
    while (netCharge != 0) {
      if (netCharge >0) {
        netCharge += anion.charge;
        anionCount ++;
      } else if (netCharge < 0) {
        netCharge += cation.charge;
      cationCount++;
      }
    }
    return new Salt(cation.name, cation.formula, cationCount, anion.name, anion.formula, anionCount, anion.solCase, cation.polyatomic, anion.polyatomic);
  }
}
