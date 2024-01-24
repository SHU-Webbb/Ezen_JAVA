package sec02_multi_parameter;


class Car{
}
class Tv {
}

//T - 제품의 종류 타입
//M - 제품의 이름 타입
public class Product<T,M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
