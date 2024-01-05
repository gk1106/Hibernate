package hotelanddishesDto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import java.util.List;

@Entity
public class Hotels 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long contact;
	private String rating ;
	@OneToMany(cascade = CascadeType.ALL)
	private List <Dishes> dishes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public List<Dishes> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dishes> dishes) {
		this.dishes = dishes;
	}
	@Override
	public String toString() {
		return "Hotels [id=" + id + ", name=" + name + ", contact=" + contact + ", rating=" + rating + ", dishes="
				+ dishes + "]";
	}
	

	
}
