package be.vdab.goededoel.entities;

import java.math.BigDecimal;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht = BigDecimal.ZERO;
	public GoedeDoel(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public BigDecimal getOpgebracht() {
		return opgebracht;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof GoedeDoel))
			return false;
		return ((GoedeDoel) obj).naam.equalsIgnoreCase(this.naam);
	}
	
}
