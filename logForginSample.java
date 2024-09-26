public class logForginSample {
  public void doNothing(HttpServletRequest request) {
      log.trace("Incoming request for: {}", String.valueOf(request.getRequestURL()).replace("\n", "").replace("\r", ""));
  }
}
