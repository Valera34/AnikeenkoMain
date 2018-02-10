package ProjectMain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;





public class Goods {
	@NotNull 
	@Size(min=2,max=30) 
    private String name;
	@NotNull
    private String category;
	@NotNull 
	private String description;
	@NotNull 
	@URL
	private String photo;
	@NotNull 
	private double price;
	
	public Goods(String name, String category,String description,String photo, double price) {
		this.name=name;
		this.category=category;
		this.description=description;
		this.photo=photo;
		this.price=price;
	}
    public String getName() {
        return name;
    }
    public void setName( String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory( String category) {
        this.category = category;
    }
	
    public String getDescription() {
        return description;
    }
    public void setDescription( String description) {
        this.description = description;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(  String photo) {
        this. photo =  photo;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(  double price) {
        this. price =  price;
    }
}
