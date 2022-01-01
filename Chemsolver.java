import java.util.Scanner;
public class Chemsolver {
  // Name, Formula, Solubility Case, Charge,
  public static Cation Lithium = new Cation("Lithium", "Li", +1, false, 6.941);
  public static Cation Sodium = new Cation("Sodium", "Na", +1, false, 22.990);
  public static Cation Potassium = new Cation("Potassium", "K", +1, false, 39.098);
  public static Cation Ammonium = new Cation("Ammonium", "NH₄", +1, true, 18.039);
  public static Cation Calcium = new Cation("Calcium", "Ca", +2, false, 40.078);
  public static Cation Strontium = new Cation("Strontium", "Sr", +2, false, 87.620);
  public static Cation Barium = new Cation("Barium", "Ba", +2, false, 137.372);
  public static Cation Silver = new Cation("Silver", "Ag", +1, false, 107.868);
  public static Cation Mercury = new Cation("Mercury", "Hg₂", +2, true, 401.180);
  public static Cation Lead = new Cation("Lead", "Pb", +2, false, 207.200);

  public static Anion Nitrate = new Anion("Nitrate", "NO₃", 1, -1, true, 62.005);
  public static Anion Acetate = new Anion("Acetate", "C₂H₃O₂", 1, -1, true, 60.052);
  public static Anion Chloride = new Anion("Chloride", "Cl", 2, -1, false, 35.453);
  public static Anion Bromide = new Anion("Bromide", "Br", 2, -1, false, 119.002);
  public static Anion Iodide = new Anion("Iodide", "I", 2, -1, false, 126.904);
  public static Anion Hydroxide = new Anion("Hydroxide", "OH", 3, -1, true, 17.008);
  public static Anion Sulfide = new Anion("Sulfide", "S", 3, -2, false, 34.100);
  public static Anion Sulfate = new Anion("Sulfate", "SO₄", 4, -2, true, 96.060);
  public static Anion Phosphate = new Anion("Phosphate", "PO₄", 5, -3, true, 94.971);
  public static Anion Carbonate = new Anion("Carbonate", "CO₃", 5, -2, true, 100.087);

  public static boolean cationSelected = false;
  public static boolean anionSelected= false;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("State First Cation");
    System.out.println("Selectable Cations are Lithium (Li), Sodium (Na), Potassium (K), Ammonium (NH₄), Calcium (Ca), Strontium (Sr), Barium (Ba), Silver (Ag), Mercury (Hg), and Lead (Pb)");
    String cationName = scanner.nextLine();
    Cation cation = null;
    Anion anion = null;
    boolean cationSelected = false;
    boolean anionSelected= false;
    while (!cationSelected) {
      if (cationName.equalsIgnoreCase("Lithium") || cationName.equalsIgnoreCase("Li")) {
        cation = Lithium;
      } else if (cationName.equalsIgnoreCase("Sodium")|| cationName.equalsIgnoreCase("Na")) {
        cation = Sodium;
      } else if (cationName.equalsIgnoreCase("Potassium")|| cationName.equalsIgnoreCase("K")) {
        cation = Potassium;
      } else if (cationName.equalsIgnoreCase("Ammonium")|| cationName.equalsIgnoreCase("NH₄")) {
        cation = Ammonium;
      } else if (cationName.equalsIgnoreCase("Calcium")|| cationName.equalsIgnoreCase("Ca")) {
        cation = Calcium;
      } else if (cationName.equalsIgnoreCase("Strontium") || cationName.equalsIgnoreCase("Sr")) {
        cation = Strontium;
      } else if (cationName.equalsIgnoreCase("Barium")|| cationName.equalsIgnoreCase("Ba")) {
        cation = Barium;
      } else if (cationName.equalsIgnoreCase("Silver")|| cationName.equalsIgnoreCase("Ag")) {
        cation = Silver;
      } else if (cationName.equalsIgnoreCase("Mercury")|| cationName.equalsIgnoreCase("Hg")) {
        cation = Mercury;
      } else if (cationName.equalsIgnoreCase("Lead")|| cationName.equalsIgnoreCase("Pb")) {
        cation = Lead;
      } else {
        cation = null;
      }
      if (cation != null) {
        System.out.println("Did you choose "+cation.name+"? (y/n)");
        String confirm = scanner.nextLine();
        if (confirm.equals("y")) {
          cationSelected = true;
          cation = cation;
        } else if (confirm.equals("n")) {
          System.out.println("State First Cation");
          cationName = scanner.nextLine();
        }
      }
    }
    System.out.println("State First Anion");
    System.out.println("Selectable Anions are Nitrate (NO₃), Acetate (C₂H₃O₂), Chloride (Cl), Bromide (Br), Iodide (I), Hydroxide (OH), Sulfide (S), Sulfate (SO₄), Phosphate (PO₄), and Carbonate (CO₃)");
    String anionName = scanner.nextLine();
    while (!anionSelected) {
      if (anionName.equalsIgnoreCase("Nitrate")|| anionName.equalsIgnoreCase("NO₃")) {
        anion = Nitrate;
      } else if (anionName.equalsIgnoreCase("Acetate") || anionName.equalsIgnoreCase("C₂H₃O₂")) {
        anion = Acetate;
      } else if (anionName.equalsIgnoreCase("Chloride")|| anionName.equalsIgnoreCase("Cl")) {
        anion = Chloride;
      } else if (anionName.equalsIgnoreCase("Bromide")|| anionName.equalsIgnoreCase("Br")) {
        anion = Bromide;
      } else if (anionName.equalsIgnoreCase("Iodide")|| anionName.equalsIgnoreCase("I")) {
        anion = Iodide;
      } else if (anionName.equalsIgnoreCase("Hydroxide")|| anionName.equalsIgnoreCase("OH")) {
        anion = Hydroxide;
      } else if (anionName.equalsIgnoreCase("Sulfide")|| anionName.equalsIgnoreCase("S")) {
        anion = Sulfide;
      } else if (anionName.equalsIgnoreCase("Sulfate")|| anionName.equalsIgnoreCase("SO₄")) {
        anion = Sulfate;
      } else if (anionName.equalsIgnoreCase("Phosphate")|| anionName.equalsIgnoreCase("PO₄")) {
        anion = Phosphate;
      } else if (anionName.equalsIgnoreCase("Carbonate")|| anionName.equalsIgnoreCase("CO₃")) {
        anion = Carbonate;
      } else {
        anion = null;
      }
      if (anion != null) {
        System.out.println("Did you choose "+anion.name+"? (y/n)");
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
    System.out.println("The salt formed by the synthesis of these two ions is " + makeSalt(cation, anion).name+". Its formula is " + makeSalt(cation, anion).formula + ". Its molar mass is "+ (double)Math.round(makeSalt(cation, anion).molarMass * 1000d) / 1000d
      +" g/mol. It is " + makeSalt(cation, anion).displaySolubility());
  }
  public String superscript(int i) {
    if (i == -3) {
      return"³⁺";
    }
    return "a";
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
    return new Salt(cation.name, cation.formula, cationCount, anion.name, anion.formula, anionCount, anion.solCase, cation.polyatomic, anion.polyatomic, cation.molarMass, anion.molarMass);
  }
}
