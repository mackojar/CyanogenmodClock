package android.app;

import java.util.UUID;

public class ProfileManager {

	public static final UUID NO_PROFILE = UUID
			.fromString("00000000-0000-0000-0000-000000000000");

	public static final String ACTION_PROFILE_PICKER = "android.intent.action.PROFILE_PICKER";
	public static final String EXTRA_PROFILE_SHOW_NONE = "android.intent.extra.profile.SHOW_NONE";
	public static final String EXTRA_PROFILE_PICKED_UUID = "android.intent.extra.profile.PICKED_UUID";
	public static final String EXTRA_PROFILE_EXISTING_UUID = "android.intent.extra.profile.EXISTING_UUID";
}
