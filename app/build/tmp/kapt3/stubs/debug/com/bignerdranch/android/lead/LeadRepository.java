package com.bignerdranch.android.lead;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\u0011J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/bignerdranch/android/lead/LeadRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lcom/bignerdranch/android/lead/database/LeadDatabase;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "leadDao", "Lcom/bignerdranch/android/lead/database/LeadDao;", "addLead", "", "lead", "Lcom/bignerdranch/android/lead/Lead;", "getLead", "Landroidx/lifecycle/LiveData;", "id", "Ljava/util/UUID;", "getLeads", "", "updateLead", "Companion", "app_debug"})
public final class LeadRepository {
    private final com.bignerdranch.android.lead.database.LeadDatabase database = null;
    private final com.bignerdranch.android.lead.database.LeadDao leadDao = null;
    private final java.util.concurrent.ExecutorService executor = null;
    private static com.bignerdranch.android.lead.LeadRepository INSTANCE;
    public static final com.bignerdranch.android.lead.LeadRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bignerdranch.android.lead.Lead>> getLeads() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.bignerdranch.android.lead.Lead> getLead(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    public final void updateLead(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.lead.Lead lead) {
    }
    
    public final void addLead(@org.jetbrains.annotations.NotNull()
    com.bignerdranch.android.lead.Lead lead) {
    }
    
    private LeadRepository(android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bignerdranch/android/lead/LeadRepository$Companion;", "", "()V", "INSTANCE", "Lcom/bignerdranch/android/lead/LeadRepository;", "get", "initialize", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final void initialize(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bignerdranch.android.lead.LeadRepository get() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}