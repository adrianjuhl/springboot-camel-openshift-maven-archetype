package ${package};

enum RouteInfo {
  READINESS_PROBE                                       ("direct:readinessprobe"),
  ;
  private String uri;
  RouteInfo(final String uri) {
    this.uri = uri;
  }
  public String id() {
    return this.name();
  }
  public String uri() {
    return uri;
  }
}
