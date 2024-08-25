// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativeorientationwidget.proxies;

public class TestData implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeOrientationWidget.TestData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		SeqNbr("SeqNbr"),
		Description("Description"),
		StartDate("StartDate"),
		Amount("Amount"),
		Text1("Text1"),
		Text2("Text2"),
		Text3("Text3");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TestData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TestData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testDataMendixObject)
	{
		if (testDataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, testDataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.testDataMendixObject = testDataMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativeorientationwidget.proxies.TestData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativeorientationwidget.proxies.TestData(context, mendixObject);
	}

	public static testnativeorientationwidget.proxies.TestData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativeorientationwidget.proxies.TestData.initialize(context, mendixObject);
	}

	public static java.util.List<testnativeorientationwidget.proxies.TestData> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testnativeorientationwidget.proxies.TestData.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of SeqNbr
	 */
	public final java.lang.Integer getSeqNbr()
	{
		return getSeqNbr(getContext());
	}

	/**
	 * @param context
	 * @return value of SeqNbr
	 */
	public final java.lang.Integer getSeqNbr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SeqNbr.toString());
	}

	/**
	 * Set value of SeqNbr
	 * @param seqnbr
	 */
	public final void setSeqNbr(java.lang.Integer seqnbr)
	{
		setSeqNbr(getContext(), seqnbr);
	}

	/**
	 * Set value of SeqNbr
	 * @param context
	 * @param seqnbr
	 */
	public final void setSeqNbr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer seqnbr)
	{
		getMendixObject().setValue(context, MemberNames.SeqNbr.toString(), seqnbr);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of Amount
	 */
	public final java.math.BigDecimal getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.math.BigDecimal getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.math.BigDecimal amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of Text1
	 */
	public final java.lang.String getText1()
	{
		return getText1(getContext());
	}

	/**
	 * @param context
	 * @return value of Text1
	 */
	public final java.lang.String getText1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text1.toString());
	}

	/**
	 * Set value of Text1
	 * @param text1
	 */
	public final void setText1(java.lang.String text1)
	{
		setText1(getContext(), text1);
	}

	/**
	 * Set value of Text1
	 * @param context
	 * @param text1
	 */
	public final void setText1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text1)
	{
		getMendixObject().setValue(context, MemberNames.Text1.toString(), text1);
	}

	/**
	 * @return value of Text2
	 */
	public final java.lang.String getText2()
	{
		return getText2(getContext());
	}

	/**
	 * @param context
	 * @return value of Text2
	 */
	public final java.lang.String getText2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text2.toString());
	}

	/**
	 * Set value of Text2
	 * @param text2
	 */
	public final void setText2(java.lang.String text2)
	{
		setText2(getContext(), text2);
	}

	/**
	 * Set value of Text2
	 * @param context
	 * @param text2
	 */
	public final void setText2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text2)
	{
		getMendixObject().setValue(context, MemberNames.Text2.toString(), text2);
	}

	/**
	 * @return value of Text3
	 */
	public final java.lang.String getText3()
	{
		return getText3(getContext());
	}

	/**
	 * @param context
	 * @return value of Text3
	 */
	public final java.lang.String getText3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text3.toString());
	}

	/**
	 * Set value of Text3
	 * @param text3
	 */
	public final void setText3(java.lang.String text3)
	{
		setText3(getContext(), text3);
	}

	/**
	 * Set value of Text3
	 * @param context
	 * @param text3
	 */
	public final void setText3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text3)
	{
		getMendixObject().setValue(context, MemberNames.Text3.toString(), text3);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testDataMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testnativeorientationwidget.proxies.TestData that = (testnativeorientationwidget.proxies.TestData) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}