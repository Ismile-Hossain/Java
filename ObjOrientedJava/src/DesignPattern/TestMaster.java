package DesignPattern;

public class TestMaster {

	public static void main(String[] args) {
		MasterLazyInitialization myMaster=MasterLazyInitialization.getInstanceVar();
		System.out.println(myMaster.learn);
		System.out.println(myMaster.why);
		System.out.println(myMaster.use);
    }

}
