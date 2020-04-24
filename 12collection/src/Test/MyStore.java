package Test;

public class MyStore<T> {
	private T material;
	
	public void seMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
}
