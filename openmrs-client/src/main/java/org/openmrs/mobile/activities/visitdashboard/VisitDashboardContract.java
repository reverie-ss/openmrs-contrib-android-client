/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.mobile.activities.visitdashboard;

import android.support.annotation.NonNull;

import org.openmrs.mobile.activities.BasePresenter;
import org.openmrs.mobile.activities.BaseView;
import org.openmrs.mobile.models.Encounter;

import java.util.List;

public interface VisitDashboardContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void setPresenter(@NonNull Presenter presenter);

        void startCaptureVitals(long patientId);

        void moveToPatientDashboard();

        void updateList(List<Encounter> visitEncounters);

        void setEmptyListVisibility(boolean visibility);
    }

    interface Presenter extends BasePresenter {
        
        void fillForm();

    }

}
