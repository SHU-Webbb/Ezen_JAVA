package sec02_multi_parameter;

public class ProductTest {

	public static void main(String[] args) {
		Product<Tv,String> p1 = new Product<Tv,String>();
		
		
		p1.setKind(new Tv());
		p1.setModel("스마트 티비");
		
		Tv tv = p1.getKind();
		String tvmodel = p1.getModel();
		
		System.out.println(tvmodel);
		
		Product<String,Integer> p2 = new Product<>();
		
		p2.setKind("국어점수");
		p2.setModel(100);
	}

}
