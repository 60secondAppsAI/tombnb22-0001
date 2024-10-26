package com.tombnb22.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;
import java.time.Year;
import jakarta.persistence.Transient;



@Entity
@Table(name="reservations")
@Getter @Setter @NoArgsConstructor
public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  	@Column(name="reservation_id")
	private Integer reservationId;
    
  	@Column(name="start_date")
	private Date startDate;
    
  	@Column(name="end_date")
	private Date endDate;
    
  	@Column(name="total_price")
	private double totalPrice;
    
	




}
