package ProjectMain;

import java.util.List;

import javax.validation.constraints.NotNull;


public class Order {
	@NotNull 
	private List ord;
	public Order(List ord) {
		this.ord=ord;
	}
    public List getOrder() {
        return ord;
    }
    public void setOrder( List ord) {
        this.ord = ord;
    }
}
