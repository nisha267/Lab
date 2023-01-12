package com.BankingManagementHibernateCrud.entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name="Bank_Information")
	public class Bank {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column (length =11,nullable =false, unique = true)
		private String holderName;
		@Column (length =15,nullable =false, unique = true)
		private int acc_no;
		@Column(length =20,nullable =false)
		private String IFSC;
		@Column(length = 15 , nullable = false)
		private String acc_type;
		@Column(length =10,nullable =false,unique=true)
		private int Balance;
		@Column(length =11,nullable =false)
		private long pin;

}
