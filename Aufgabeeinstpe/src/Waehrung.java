
public class Waehrung {

	String name = "";
	String kuerzel = "";
	Double kurs = 0.0;

	public static void main(String[] args) {

	}



	public String getName() {
		return name;
	}



	



	public String getKuerzel() {
		return kuerzel;
	}



	



	public Double getKurs() {
		return kurs;
	}







	public String toString() {
		return "Waehrung [name=" + name + ", kuerzel=" + kuerzel + ", kurs=" + kurs + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Waehrung other = (Waehrung) obj;
		if (kuerzel == null) {
			if (other.kuerzel != null)
				return false;
		} else if (!kuerzel.equals(other.kuerzel))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
