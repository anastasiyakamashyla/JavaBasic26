package by.cdptr.les08.main;

public class BankAccount {

    private String currency;
    private int number;
    
    
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BankAccount [currency=" + currency + ", number=" + number + "]";
	}
}	

