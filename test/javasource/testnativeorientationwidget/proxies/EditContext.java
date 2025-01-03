// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativeorientationwidget.proxies;

public class EditContext implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject editContextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativeOrientationWidget.EditContext";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Orientation("Orientation");

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

	public EditContext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected EditContext(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject editContextMendixObject)
	{
		if (editContextMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, editContextMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.editContextMendixObject = editContextMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativeorientationwidget.proxies.EditContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativeorientationwidget.proxies.EditContext(context, mendixObject);
	}

	public static testnativeorientationwidget.proxies.EditContext load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativeorientationwidget.proxies.EditContext.initialize(context, mendixObject);
	}

	/**
	 * Get value of Orientation
	 * @param orientation
	 */
	public final testnativeorientationwidget.proxies.ENUM_Orientation getOrientation()
	{
		return getOrientation(getContext());
	}

	/**
	 * @param context
	 * @return value of Orientation
	 */
	public final testnativeorientationwidget.proxies.ENUM_Orientation getOrientation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Orientation.toString());
		if (obj == null) {
			return null;
		}
		return testnativeorientationwidget.proxies.ENUM_Orientation.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Orientation
	 * @param orientation
	 */
	public final void setOrientation(testnativeorientationwidget.proxies.ENUM_Orientation orientation)
	{
		setOrientation(getContext(), orientation);
	}

	/**
	 * Set value of Orientation
	 * @param context
	 * @param orientation
	 */
	public final void setOrientation(com.mendix.systemwideinterfaces.core.IContext context, testnativeorientationwidget.proxies.ENUM_Orientation orientation)
	{
		if (orientation != null) {
			getMendixObject().setValue(context, MemberNames.Orientation.toString(), orientation.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Orientation.toString(), null);
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return editContextMendixObject;
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
			final testnativeorientationwidget.proxies.EditContext that = (testnativeorientationwidget.proxies.EditContext) obj;
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
