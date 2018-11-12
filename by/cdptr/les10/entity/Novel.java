package by.cdptr.les10.entity;

public class Novel extends Book {

	private String loveHero;

	public Novel(String title, String author, double price, String loveHero) {
		super(title, author, price);
		this.loveHero = loveHero;
	}
	

	public String getLoveHero() {
		return loveHero;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((loveHero == null) ? 0 : loveHero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Novel other = (Novel) obj;
		if (loveHero == null) {
			if (other.loveHero != null)
				return false;
		} else if (!loveHero.equals(other.loveHero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Novel [loveHero=" + loveHero + "title=" + getTitle() + ", author=" + getAuthor() + ", price=" + getPrice() + "]";
	}	

}
