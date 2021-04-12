# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Interfaces for the sick_safetyscanners ros2 driver"
AUTHOR = "Lennart Puck <puck@fzi.de>"
ROS_AUTHOR = "Lennart Puck"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "ALv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=48a602c865794401f5c0c56e309d9596"

ROS_CN = "sick_safetyscanners2_interfaces"
ROS_BPN = "sick_safetyscanners2_interfaces"

ROS_BUILD_DEPENDS = " \
    rosidl-default-generators \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SICKAG/sick_safetyscanners2_interfaces-release/archive/release/foxy/sick_safetyscanners2_interfaces/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/sick_safetyscanners2_interfaces"
SRC_URI = "git://github.com/SICKAG/sick_safetyscanners2_interfaces-release;${ROS_BRANCH};protocol=https"
SRCREV = "34d8cd11e711a4d46c538ddcaf286941e8d7eac2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}