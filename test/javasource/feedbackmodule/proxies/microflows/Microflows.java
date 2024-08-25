// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package feedbackmodule.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the FeedbackModule module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder convertBase64StringBuilder(
		java.lang.String _imageB64
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("FeedbackModule.ConvertBase64String");
		builder = builder.withParam("ImageB64", _imageB64);
		return builder;
	}

	public static java.lang.String convertBase64String(
		IContext context,
		java.lang.String _imageB64
	)
	{
		Object result = convertBase64StringBuilder(
				_imageB64
			)
			.execute(context);
		return (java.lang.String) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder convertUUIDToURLBuilder(
		java.lang.String _uuid
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("FeedbackModule.ConvertUUIDToURL");
		builder = builder.withParam("uuid", _uuid);
		return builder;
	}

	public static java.lang.String convertUUIDToURL(
		IContext context,
		java.lang.String _uuid
	)
	{
		Object result = convertUUIDToURLBuilder(
				_uuid
			)
			.execute(context);
		return (java.lang.String) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder populateUserAttributesBuilder(
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("FeedbackModule.PopulateUserAttributes");
		builder = builder.withParam("Feedback", _feedback);
		return builder;
	}

	public static void populateUserAttributes(
		IContext context,
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		populateUserAttributesBuilder(
				_feedback
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sanitizeFeedbackBuilder(
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("FeedbackModule.SanitizeFeedback");
		builder = builder.withParam("Feedback", _feedback);
		return builder;
	}

	public static void sanitizeFeedback(
		IContext context,
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		sanitizeFeedbackBuilder(
				_feedback
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sendFeedbackToServerBuilder(
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("FeedbackModule.SendFeedbackToServer");
		builder = builder.withParam("Feedback", _feedback);
		return builder;
	}

	public static feedbackmodule.proxies.ResponseHelper sendFeedbackToServer(
		IContext context,
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		Object result = sendFeedbackToServerBuilder(
				_feedback
			)
			.execute(context);
		return result == null ? null : feedbackmodule.proxies.ResponseHelper.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sUB_PostFeedbackToAppInsightsBuilder(
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("FeedbackModule.SUB_PostFeedbackToAppInsights");
		builder = builder.withParam("Feedback", _feedback);
		return builder;
	}

	public static feedbackmodule.proxies.ResponseHelper sUB_PostFeedbackToAppInsights(
		IContext context,
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		Object result = sUB_PostFeedbackToAppInsightsBuilder(
				_feedback
			)
			.execute(context);
		return result == null ? null : feedbackmodule.proxies.ResponseHelper.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_FeedbackBuilder(
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("FeedbackModule.VAL_Feedback");
		builder = builder.withParam("Feedback", _feedback);
		return builder;
	}

	public static boolean vAL_Feedback(
		IContext context,
		feedbackmodule.proxies.Feedback _feedback
	)
	{
		Object result = vAL_FeedbackBuilder(
				_feedback
			)
			.execute(context);
		return (boolean) result;
	}
}
