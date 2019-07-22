import javax.swing.JOptionPane;

public class CalculatePhysics {

	public static void main(String[] args) {

		CalculatePhysics menuOption = new CalculatePhysics(); 
		
		int menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
				" To Calculate quick Physics\nChoose equation\n1. F=ma\n2. KE=1/2*mv^2\n3. Fc=mv^2/r\n4. V=ir"));

		if (menuChoice == 1) {
			menuOption.ForceValueCalculator();
		} else if (menuChoice == 2) {
			menuOption.KineticEnergyValueCalculator();
		} else if (menuChoice == 3) {
			menuOption.CentripetalForceValueCalculator();
			menuOption.VoltageValueCalculator();
		} else {
			JOptionPane.showMessageDialog(null, "ERROR:\nInvalid input function\nPlease try again");
		}
	}

	public void ForceValueCalculator() {

		int mass1 = Integer.parseInt(
				JOptionPane.showInputDialog("Enter mass (m) weight in kilograms (kg) ")); 
		int acceleration1 = Integer.parseInt(JOptionPane.showInputDialog(
				"Enter acceleration (a = speed over time) value in meters per second (m/s)")); 
		double forceValue = mass1 * acceleration1;

		JOptionPane.showMessageDialog(null, "Force = " + forceValue);

	}

	public void KineticEnergyValueCalculator() {
//the user is encouraged to use whole numbers or integers
		int mass2 = Integer.parseInt(
				JOptionPane.showInputDialog("Enter mass (m) value in kilograms (kg) to the nearest whole number"));

		int velocity2 = Integer.parseInt(JOptionPane
				.showInputDialog("Enter velocity (v) value in meters per second (m/s) to the nearest whole number"));
		double kineticEnergy = 0.5 * mass2 * (velocity2 * velocity2);

		JOptionPane.showMessageDialog(null, "Kinetic Engergy = " + kineticEnergy);

	}

	public void CentripetalForceValueCalculator() {
		int mass3 = Integer.parseInt(
				JOptionPane.showInputDialog("Enter mass (m) value in kilograms (kg) to the nearest whole number"));

		int velocity3 = Integer.parseInt(JOptionPane
				.showInputDialog("Enter velocity (v) value in meters per second (m/s) to the nearest whole number"));
		int radius3 = Integer.parseInt(
				JOptionPane.showInputDialog("Enter radius (r) value in meters (m) to the nearest whole number"));
		double centripetalForce = (mass3 * (velocity3 * velocity3)) / radius3;
		JOptionPane.showMessageDialog(null, "Centripetal Force = " + centripetalForce);

	}

	public void VoltageValueCalculator() {
//If a decimal value, letter or word is entered in any given input then the program would crash so the user is encouraged to use whole numbers or integers
		int current4 = Integer.parseInt(
				JOptionPane.showInputDialog("Enter current (i) value in milliamps (mA) to the nearest whole number"));

		int resistance4 = Integer.parseInt(
				JOptionPane.showInputDialog("Enter resistance (r) value in ohms (Omega) to the nearest whole number"));
		double voltageValue = current4 * resistance4;
		JOptionPane.showMessageDialog(null, "Voltage = " + voltageValue);
	}
}
