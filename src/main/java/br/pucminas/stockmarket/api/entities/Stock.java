package br.pucminas.stockmarket.api.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.pucminas.stockmarket.api.enums.StockTypeEnum;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Company company;
	
	private String description;
	
	@Enumerated(value = EnumType.STRING)
	private StockTypeEnum stockType;
	
	private Long stocksForSale;
	
	@OneToMany
	private List<HistoricalStockPrice> historicalStockPrices;
	
	private Calendar creationDate;
	
	private Calendar lastUpdate;
}
