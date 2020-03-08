package fmi.informatics.functional;

// Създаваме интерфейс IGravity с default метод
public interface IGravity {
	
	default double acceleration() {
		return 9.80665;
	}
	
}
