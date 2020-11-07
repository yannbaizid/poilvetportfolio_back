package fr.yannbaizid.payveportfolio.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String path;
	String alias;
	public Image(String path, String alias) {
		super();
		this.path = path;
		this.alias = alias;
	}
	
	
	
}
