# frozen_string_literal: true

module LCSP
  # Solutions finder.
  class LCSPFinder
    # @param {String} path
    # @param {String} number
    def initialize(path, number)
      @path = path
      @number = number
    end

    # @return {String}
    def solution
      lines = ::File.readlines("#{@path}/README.md").reject { |line| line.include?(@number) }

      return if lines.empty?

      line = lines.first

      line[line.rindex('[Link]'), line.rindex(')')]
    end
  end
end
