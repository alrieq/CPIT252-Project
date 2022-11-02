package cpit252.project;
public enum EnumLogger {

    INSTANCE;
  
    @Override
    public String toString() {
      return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
  }