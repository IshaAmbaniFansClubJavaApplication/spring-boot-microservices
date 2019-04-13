package spring.boot.microservices.springbootmicroservicmoviecatalogserviceapp.model;

public class CatalogItem {
	private String namme;
	private String desc;
	private int rating;
	public String getNamme() {
		return namme;
	}
	public void setNamme(String namme) {
		this.namme = namme;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CatalogItem [namme=" + namme + ", desc=" + desc + ", rating=" + rating + "]";
	}
	public CatalogItem(String namme, String desc, int rating) {
		super();
		this.namme = namme;
		this.desc = desc;
		this.rating = rating;
	}
	
}
