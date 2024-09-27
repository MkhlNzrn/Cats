package org.example.entities.cat;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.example.entities.owner.Owner;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cat.class)
public abstract class Cat_ {

	public static volatile SingularAttribute<Cat, Owner> owner;
	public static volatile SingularAttribute<Cat, LocalDate> birthday;
	public static volatile SingularAttribute<Cat, Color> color;
	public static volatile SingularAttribute<Cat, String> name;
	public static volatile SingularAttribute<Cat, Integer> id;
	public static volatile SingularAttribute<Cat, String> breed;
	public static volatile ListAttribute<Cat, Cat> friends;

	public static final String OWNER = "owner";
	public static final String BIRTHDAY = "birthday";
	public static final String COLOR = "color";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String BREED = "breed";
	public static final String FRIENDS = "friends";

}

