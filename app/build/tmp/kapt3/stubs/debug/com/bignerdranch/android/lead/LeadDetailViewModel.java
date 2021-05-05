package com.bignerdranch.android.lead;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/bignerdranch/android/lead/LeadDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "leadIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/UUID;", "leadLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bignerdranch/android/lead/Lead;", "getLeadLiveData", "()Landroidx/lifecycle/LiveData;", "setLeadLiveData", "(Landroidx/lifecycle/LiveData;)V", "leadRepository", "Lcom/bignerdranch/android/lead/LeadRepository;", "loadLead", "", "leadId", "saveLead", "lead", "app_debug"})
public final class LeadDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.bignerdranch.android.lead.LeadRepository leadRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.UUID> leadIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.bignerdranch.android.lead.Lead> leadLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.bignerdranch.android.lead.Lead> getLeadLiveData() {
        return null;
    }
    
    public final void setLeadLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.bignerdranch.android.lead.Lead> p0) {
    }
    
    public final void loadLead(@org.jetbrains.annotations.NotNull()
    java.util.UUID leadId) {
    }
    
    public final void saveLead(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.lead.Lead lead) {
    }
    
    public LeadDetailViewModel() {
        super();
    }
}