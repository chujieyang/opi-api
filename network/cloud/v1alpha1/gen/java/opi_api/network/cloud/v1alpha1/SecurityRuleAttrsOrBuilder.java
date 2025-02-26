// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SecurityRuleAttrsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SecurityRuleAttrs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * priority of this rule (lower the numeric value, higher the priority is)
   * if there are multiple rules with same highest priority that match the
   * packet, the first such matching rule in the policy is picked (i.e., based
   * on the order, first in the list of such matching rules)
   * range:0-65534
   * </pre>
   *
   * <code>int32 priority = 1;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * rule match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleMatch match = 2;</code>
   * @return Whether the match field is set.
   */
  boolean hasMatch();
  /**
   * <pre>
   * rule match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleMatch match = 2;</code>
   * @return The match.
   */
  opi_api.network.opinetcommon.v1alpha1.RuleMatch getMatch();
  /**
   * <pre>
   * rule match criteria
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RuleMatch match = 2;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.RuleMatchOrBuilder getMatchOrBuilder();

  /**
   * <pre>
   * action to take when this rule is matched
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction action = 3;</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <pre>
   * action to take when this rule is matched
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction action = 3;</code>
   * @return The action.
   */
  opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction getAction();

  /**
   * <pre>
   * when a rule marked as terminating is picked (based on the priority) as the
   * matching rule from a policy, then the action of such rule will prevail or
   * stick over the matching rules picked from already evaluated policies and
   * the search for other matching rules in policies yet to be evaluated for
   * that packet will stop (i.e., packet hitting terminating rule will pick
   * corresponding action irrespective any other matching rules across all
   * policies)
   * </pre>
   *
   * <code>bool terminating = 4;</code>
   * @return The terminating.
   */
  boolean getTerminating();

  /**
   * <pre>
   * ALGSpec, if specified contains ALG specific behavior
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.ALGSpec alg_spec = 5;</code>
   * @return Whether the algSpec field is set.
   */
  boolean hasAlgSpec();
  /**
   * <pre>
   * ALGSpec, if specified contains ALG specific behavior
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.ALGSpec alg_spec = 5;</code>
   * @return The algSpec.
   */
  opi_api.network.cloud.v1alpha1.ALGSpec getAlgSpec();
  /**
   * <pre>
   * ALGSpec, if specified contains ALG specific behavior
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.ALGSpec alg_spec = 5;</code>
   */
  opi_api.network.cloud.v1alpha1.ALGSpecOrBuilder getAlgSpecOrBuilder();
}
