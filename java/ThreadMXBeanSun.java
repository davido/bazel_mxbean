import com.sun.management.ThreadMXBean;

class ThreadMXBeanSun {
  private final ThreadMXBean sys;

  ThreadMXBeanSun(java.lang.management.ThreadMXBean sys) {
    this.sys = (ThreadMXBean) sys;
  }

  public long getCurrentThreadAllocatedBytes() {
    // TODO(ms): call getCurrentThreadAllocatedBytes as soon as this is available in the patched
    // Java version used by bazel
    //return sys.getThreadAllocatedBytes(Thread.currentThread().getId());
    return sys.getCurrentThreadAllocatedBytes();
  }
}

