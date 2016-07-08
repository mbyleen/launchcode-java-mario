package pyramidPrint;

public class MarioPyramidPrinter {
	
	private TextPyramidBuilder pyramid;
	private IntegerInputPrompt heightGetter;
	private TextBasedMenu menu;
	
	public MarioPyramidPrinter() {
		pyramid = new TextPyramidBuilder();
		heightGetter = new IntegerInputPrompt();
		menu = new TextBasedMenu();
	}
	
	public static void main (String[] args) {
		MarioPyramidPrinter mpp = new MarioPyramidPrinter();
		mpp.printPyramid();
	}
	
	public void printPyramid() {
		int selectedOption = promptUserForOutputType();
		int heightInSteps = promptUserForPyramidHeight();
		if (selectedOption == 0) {
			printPyramidToStandardOutput(heightInSteps);
		}
		else if (selectedOption == 1) {
			printPyramidToFile(heightInSteps);
		}
	}
	
	private int promptUserForOutputType() {
		String option0 = "Print pyramid to standard output";
		String option1 = "Print pyramid to file";
		int selectedOption = menu.getUserSelectionFromMenu(option0, option1);
		return selectedOption;
	}
	
	private int promptUserForPyramidHeight() {
		String prompt = "Enter a height in steps for the pyramid: ";
		int heightInSteps = heightGetter.getBoundedIntegerInput(0,23,prompt);
		return heightInSteps;
	}
	
	private void printPyramidToStandardOutput(int heightInSteps) {
		String pyramidOutput = pyramid.buildPyramidString(heightInSteps);
		System.out.println(pyramidOutput);
	}
	
	private void printPyramidToFile(int heightInSteps) {
		
	}
	
}
		
	