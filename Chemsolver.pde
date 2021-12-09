// Name, Formula, Solubility Case, Charge,
public Ion Nitrate = new Ion("Nitrate", "NO₃", 1, -1);
public Ion Ammonium = new Ion("Ammonium", "NH", 1, +1);
public Ion Acetate = new Ion("Acetate", "CHO", 1, -1);
public Ion Sodium = new Ion("Sodium", "Na", 1, +1);
JSONObject Ions;
int newSolCase;
boolean soluble;
public void setup() {
  Ions = loadJSONObject("Ions.json");
}

public void draw() {
}

public Ion makeSalt(Ion a, Ion b ) {
  if (a.solCase > b.solCase) {
    newSolCase = a.solCase;
  } else if (b.solCase > a.solCase) {
    newSolCase = b.solCase;
  };
  Ion Fish = new Ion("a", "a", newSolCase, 1);
  return Fish;
}

public boolean Solubility(Ion a, Ion b) {

  if (a.solCase == 1 || a.solCase == 1) {
    soluble = true;
  }
  if (a.solCase == 2) {
    if (((b.name.equalsIgnoreCase("nitrate")) || b.name.equalsIgnoreCase("Acetate")) || a.solCase == 2) {
    }
  }
  return soluble;
}
