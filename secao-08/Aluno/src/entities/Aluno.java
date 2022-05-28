package entities;

public class Aluno {
	public String name;
	public double nota1, nota2, nota3;
	
	private double calculateTotal () {
		return nota1 + nota2 + nota3;
	}
	
	public String verifyApproved () {
		if (this.calculateTotal() > 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
	
	private double calculatesMissingNotes () {
		return 60 - this.calculateTotal();
	}
	
	public void showResult () {
		System.out.println("FINAL GRADE = " + this.calculateTotal());
		System.out.println(this.verifyApproved());
		
		if (this.calculateTotal() < 60) {
			System.out.println("MISSING " + this.calculatesMissingNotes() + " POINTS");
		}
	}
}
