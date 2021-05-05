package com.bignerdranch.android.lead;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/bignerdranch/android/lead/LeadListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "leadListLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/bignerdranch/android/lead/Lead;", "getLeadListLiveData", "()Landroidx/lifecycle/LiveData;", "leadRepository", "Lcom/bignerdranch/android/lead/LeadRepository;", "addLead", "", "lead", "app_debug"})
public final class LeadListViewModel extends androidx.lifecycle.ViewModel {
    private final com.bignerdranch.android.lead.LeadRepository leadRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.lead.Lead>> leadListLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.lead.Lead>> getLeadListLiveData() {
        return null;
    }
    
    public final void addLead(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.lead.Lead lead) {
    }
    
    public LeadListViewModel() {
        super();
    }
}