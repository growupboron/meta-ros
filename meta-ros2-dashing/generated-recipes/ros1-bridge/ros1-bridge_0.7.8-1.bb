# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "A simple bridge between ROS 1 and ROS 2"
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros1_bridge"
ROS_BPN = "ros1_bridge"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    actionlib-msgs \
    builtin-interfaces \
    diagnostic-msgs \
    example-interfaces \
    gazebo-msgs \
    geometry-msgs \
    nav-msgs \
    pkgconfig \
    python3-pyyaml \
    rclcpp \
    rcutils \
    rmw-implementation-cmake \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-index-python-native \
    python3-catkin-pkg-native \
    rosidl-cmake-native \
    rosidl-parser-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    pkgconfig-native \
"

ROS_EXEC_DEPENDS = " \
    action-msgs \
    actionlib-msgs \
    builtin-interfaces \
    diagnostic-msgs \
    example-interfaces \
    gazebo-msgs \
    geometry-msgs \
    nav-msgs \
    python3-pyyaml \
    rclcpp \
    rcutils \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    demo-nodes-cpp \
    diagnostic-msgs \
    launch \
    launch-testing \
    launch-testing-ament-cmake \
    launch-testing-ros \
    ros2run \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros1_bridge-release/archive/release/dashing/ros1_bridge/0.7.8-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/ros1_bridge"
SRC_URI = "git://github.com/ros2-gbp/ros1_bridge-release;${ROS_BRANCH};protocol=https"
SRCREV = "8970784e7bf06f7f1a3dd3df2e3342f88a43c075"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
