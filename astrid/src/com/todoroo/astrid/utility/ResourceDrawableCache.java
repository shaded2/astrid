package com.todoroo.astrid.utility;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.eztransition.tasquid.R;
import com.todoroo.andlib.service.ContextManager;

/**
 * This class caches common images based on resource ID to avoid
 * the performance hit from constantly loading them from disk
 * @author Sam
 *
 */
public class ResourceDrawableCache {

    private static Drawable ICN_DEFAULT_PERSON_IMAGE = null;
    private static Drawable ICN_ANYONE = null;
    private static Drawable ICN_ANYONE_TRANSPARENT = null;
    private static Drawable ICN_ADD_CONTACT = null;

    private static Drawable DEFAULT_LIST_0 = null;
    private static Drawable DEFAULT_LIST_1 = null;
    private static Drawable DEFAULT_LIST_2 = null;
    private static Drawable DEFAULT_LIST_3 = null;


    public static Drawable getImageDrawableFromId(Resources r, int resId) {
        if (r == null)
            r = ContextManager.getResources();
        if (resId == R.drawable.icn_default_person_image) {
            if (ICN_DEFAULT_PERSON_IMAGE == null)
                ICN_DEFAULT_PERSON_IMAGE = r.getDrawable(resId);
            return ICN_DEFAULT_PERSON_IMAGE;
        } else if (resId == R.drawable.icn_anyone) {
            if (ICN_ANYONE == null)
                ICN_ANYONE = r.getDrawable(resId);
            return ICN_ANYONE;
        } else if (resId == R.drawable.icn_anyone_transparent) {
            if (ICN_ANYONE_TRANSPARENT == null)
                ICN_ANYONE_TRANSPARENT = r.getDrawable(resId);
            return ICN_ANYONE_TRANSPARENT;
        } else if (resId == R.drawable.icn_add_contact) {
            if (ICN_ADD_CONTACT == null)
                ICN_ADD_CONTACT = r.getDrawable(resId);
            return ICN_ADD_CONTACT;
        } else if (resId == R.drawable.default_list_0) {
            if (DEFAULT_LIST_0 == null)
                DEFAULT_LIST_0 = r.getDrawable(resId);
            return DEFAULT_LIST_0;
        } else if (resId == R.drawable.default_list_1) {
            if (DEFAULT_LIST_1 == null)
                DEFAULT_LIST_1 = r.getDrawable(resId);
            return DEFAULT_LIST_1;
        } else if (resId == R.drawable.default_list_2) {
            if (DEFAULT_LIST_2 == null)
                DEFAULT_LIST_2 = r.getDrawable(resId);
            return DEFAULT_LIST_2;
        } else if (resId == R.drawable.default_list_3) {
            if (DEFAULT_LIST_3 == null)
                DEFAULT_LIST_3 = r.getDrawable(resId);
            return DEFAULT_LIST_3;
        } else {
            return r.getDrawable(resId);
        }
    }

}
