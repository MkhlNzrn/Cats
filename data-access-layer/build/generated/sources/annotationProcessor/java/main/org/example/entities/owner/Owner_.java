package org.example.entities.owner;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.example.entities.cat.Cat;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Owner.class)
public abstract class Owner_ {

	public static volatile SingularAttribute<Owner, LocalDate> birthday;
	public static volatile ListAttribute<Owner, Cat> cats;
	public static volatile SingularAttribute<Owner, String> name;
	public static volatile SingularAttribute<Owner, Integer> id;

	public static final String BIRTHDAY = "birthday";
	public static final String CATS = "cats";
	public static final String NAME = "name";
	public static final String ID = "id";

}

